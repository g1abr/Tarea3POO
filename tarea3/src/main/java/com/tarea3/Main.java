package com.tarea3;

import java.util.List;
import java.util.Scanner;

import com.Enum.Area_enum;
import com.Enum.Ciudad_enum;
import com.Enum.Experiencia;
import com.Enum.LenguajeProgramacion;
import com.Enum.TipoDocumento;
import com.tarea3.Modelos.Admin;
import com.tarea3.Modelos.Desarrollador;
import com.tarea3.Modelos.Empleado;
import com.tarea3.Modelos.Empresa;
import com.tarea3.Modelos.EmpresaDesarrollo;
import com.tarea3.Modelos.GestorProyectos;
import com.tarea3.Operaciones.IOperacionEmpleado;
import com.tarea3.Operaciones.IOperacionEmpresa;
import com.tarea3.Operaciones.OperacionEmpleado;
import com.tarea3.Operaciones.OperacionEmpresa;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IOperacionEmpleado opEmpleado = new OperacionEmpleado();
        IOperacionEmpresa opEmpresa = new OperacionEmpresa();

        int opcion;
        do {
            System.out.println("\n");
            System.out.println("\n--- MENÚ PRINCIPAL ---");
            System.out.println("1. Crear empresa");
            System.out.println("2. Crear empleado");
            System.out.println("3. Listar empresas");
            System.out.println("4. Listar empleados");
            System.out.println("5. Buscar empleado por documento");
            System.out.println("6. Calcular sueldo de empleado");
            System.out.println("7. Contar empleados por empresa");
            System.out.println("8. Buscar empresa por NIT");
            System.out.println("9. Listar empleados por empresa");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            // System.out.println("\n");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingrese datos de la empresa:");
                    System.out.print("NIT: ");
                    String nit = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Dirección: ");
                    String direccion = sc.nextLine();

                    System.out.println("Elige la ciudad:");
                    System.out.println("1. Barranquilla, 2. Cartagena, 3. Soledad, 4. Villavicencio");
                    Ciudad_enum ciudad = null;

                    while (ciudad == null) {
                        String entradaCiudad = sc.nextLine().trim();
                        switch (entradaCiudad) {
                            case "1" -> ciudad = Ciudad_enum.BARRANQUILLA;
                            case "2" -> ciudad = Ciudad_enum.CARTAGENA;
                            case "3" -> ciudad = Ciudad_enum.SOLEDAD;
                            case "4" -> ciudad = Ciudad_enum.VILLAVICENCIO;
                            default -> System.out.println("Opción inválida. Intente nuevamente.");
                        }
                    }

                    System.out.print("Representante legal: ");
                    String representante = sc.nextLine();
                    System.out.print("Registro cámara de comercio: ");
                    String registro = sc.nextLine();
                    Empresa empresa = new EmpresaDesarrollo(nit, nombre, direccion, ciudad, representante, registro);
                    opEmpresa.agregarEmpresa(empresa);
                    System.out.println("\n");
                    System.out.println("Empresa creada.");

                }

                case 2 -> {
                    System.out.println("Seleccione tipo de empleado:");
                    System.out.println("1. Desarrollador");
                    System.out.println("2. Admin");
                    System.out.println("3. Gestor de Proyectos");
                    int tipo = Integer.parseInt(sc.nextLine());

                    List<Empresa> empresas = opEmpresa.listarEmpresas();
                    if (empresas.isEmpty()) {
                        System.out.println("No hay empresas registradas. Crea una antes de registrar empleados.");
                        return;
                    }
                    System.out.println("Seleccione una empresa para el empleado:");
                    for (int i = 0; i < empresas.size(); i++) {
                        System.out.println((i + 1) + ". " + empresas.get(i).getNombre());
                    }
                    int seleccionEmpresa = Integer.parseInt(sc.nextLine());
                    Empresa empresaSeleccionada = empresas.get(seleccionEmpresa - 1);

                    System.out.print(
                            "Tipo documento (1. Cedula de Ciudadania, 2. Cedula de Extranjeria, 3. Pasaporte, 4. Pep): ");

                    TipoDocumento tipoDoc = null;

                    while (tipoDoc == null) {
                        String entradaCiudad = sc.nextLine().trim();
                        switch (entradaCiudad) {
                            case "1" -> tipoDoc = TipoDocumento.CEDULA_CIUDADANIA;
                            case "2" -> tipoDoc = TipoDocumento.CEDULA_EXTRANJERIA;
                            case "3" -> tipoDoc = TipoDocumento.PASAPORTE;
                            case "4" -> tipoDoc = TipoDocumento.PEP;
                            default -> System.out.println("Opción inválida. Intente nuevamente.");
                        }
                    }

                    System.out.print("Documento: ");
                    String doc = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Valor hora: ");
                    float valorHora = Float.parseFloat(sc.nextLine());
                    System.out.print("Número de horas trabajadas: ");
                    int horas = Integer.parseInt(sc.nextLine());

                    switch (tipo) {
                        case 1 -> {
                            System.out.print(
                                    "Lenguaje (1. JAVA, 2. PYTHON, 3. JAVASCRIPT, 4. CSHARP, 5. KOTLIN, 6. RUBY): ");
                            LenguajeProgramacion lenguaje = null;

                            while (lenguaje == null) {
                                String entradaCiudad = sc.nextLine().trim();
                                switch (entradaCiudad) {
                                    case "1" -> lenguaje = LenguajeProgramacion.JAVA;
                                    case "2" -> lenguaje = LenguajeProgramacion.PYTHON;
                                    case "3" -> lenguaje = LenguajeProgramacion.JAVASCRIPT;
                                    case "4" -> lenguaje = LenguajeProgramacion.CSHARP;
                                    case "5" -> lenguaje = LenguajeProgramacion.KOTLIN;
                                    case "6" -> lenguaje = LenguajeProgramacion.KOTLIN;
                                    default -> System.out.println("Opción inválida. Intente nuevamente.");
                                }
                            }

                            System.out.print("Nivel experiencia: JUNIOR, SEMISENIOR, SENIOR: (Digite 1,2 o 3) ");
                            Experiencia experiencia = null;

                            while (experiencia == null) {
                                String entradaCiudad = sc.nextLine().trim();
                                switch (entradaCiudad) {
                                    case "1" -> experiencia = Experiencia.Junior;
                                    case "2" -> experiencia = Experiencia.Mid;
                                    case "3" -> experiencia = Experiencia.Senior;
                                    default -> System.out.println("Opción inválida. Intente nuevamente.");
                                }
                            }

                            System.out.print("Proyectos entregados: ");
                            int proyectos = Integer.parseInt(sc.nextLine());
                            Desarrollador dev = new Desarrollador(tipoDoc, doc, nombre, valorHora, horas,
                                    empresaSeleccionada,
                                    lenguaje,
                                    experiencia, proyectos);
                            opEmpleado.agregarEmpleado(dev);
                        }
                        case 2 -> {
                            System.out.print("Documentos gestionados: ");
                            int documentos = Integer.parseInt(sc.nextLine());
                            System.out.print("Llamadas atendidas: ");
                            int llamadas = Integer.parseInt(sc.nextLine());
                            Admin admin = new Admin(tipoDoc, doc, nombre, valorHora, horas, empresaSeleccionada,
                                    documentos, llamadas);
                            opEmpleado.agregarEmpleado(admin);
                        }
                        case 3 -> {
                            System.out.print("Área (1. Tecnología, 2. Contabilidad): ");
                            Area_enum area = null;

                            while (area == null) {
                                String entradaCiudad = sc.nextLine().trim();
                                switch (entradaCiudad) {
                                    case "1" -> area = Area_enum.Tecnologia;
                                    case "2" -> area = Area_enum.CONTABILIDAD;
                                    default -> System.out.println("Opción inválida. Intente nuevamente.");
                                }
                            }

                            GestorProyectos gestor = new GestorProyectos(tipoDoc, doc, nombre, valorHora, horas,
                                    empresaSeleccionada, area);
                            opEmpleado.agregarEmpleado(gestor);
                        }
                        default -> System.out.println("Tipo inválido.");
                    }

                    System.out.println("Empleado creado.");
                }

                case 3 -> {
                    List<Empresa> empresas = opEmpresa.listarEmpresas();
                    if (empresas.isEmpty()) {
                        System.out.println("No hay empresas registradas.");
                    } else {
                        empresas.forEach(System.out::println);
                    }
                }

                case 4 -> {
                    List<Empleado> empleados = opEmpleado.listarEmpleados();
                    if (empleados.isEmpty()) {
                        System.out.println("No hay empleados registrados.");
                    } else {
                        empleados.forEach(System.out::println);
                    }
                }

                case 5 -> {
                    System.out.print("Documento del empleado: ");
                    String doc = sc.nextLine();
                    Empleado emp = opEmpleado.buscarPorDocumento(doc);
                    System.out.println(emp != null ? emp : "Empleado no encontrado.");
                }

                case 6 -> {
                    System.out.print("Documento del empleado: ");
                    String doc = sc.nextLine();
                    double sueldo = opEmpleado.calcularSueldo(doc);
                    System.out.println("Sueldo calculado: $" + sueldo);
                }

                case 7 -> {
                    List<Empresa> empresas = opEmpresa.listarEmpresas();

                    if (!empresas.isEmpty()) {
                        System.out.println("Empresas registradas:");
                        for (int i = 0; i < empresas.size(); i++) {
                            System.out.println((i + 1) + ". " + empresas.get(i).getNombre() + " - NIT: "
                                    + empresas.get(i).getNit());
                        }

                        int seleccion = -1;
                        Empresa empresaSeleccionada = null;

                        while (empresaSeleccionada == null) {
                            System.out.print("Seleccione una empresa por número: ");
                            try {
                                seleccion = Integer.parseInt(sc.nextLine()) - 1;
                                if (seleccion >= 0 && seleccion < empresas.size()) {
                                    empresaSeleccionada = empresas.get(seleccion);
                                } else {
                                    System.out.println("Número inválido. Intente nuevamente.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Entrada no válida. Ingrese un número.");
                            }
                        }

                        int total = opEmpleado.contarPorEmpresa(empresaSeleccionada.getNit());
                        System.out.println(
                                "Total empleados en la empresa " + empresaSeleccionada.getNombre() + ": " + total);
                    } else {
                        System.out.println("No hay empresas registradas.");
                    }
                }

                case 8 -> {
                    System.out.print("NIT de la empresa: ");
                    String nit = sc.nextLine();
                    Empresa empresa = opEmpresa.buscarEmpresa(nit);
                    System.out.println(empresa != null ? empresa : "Empresa no encontrada.");
                }
                case 9 -> {
                    List<Empresa> empresas = opEmpresa.listarEmpresas();

                    if (!empresas.isEmpty()) {
                        System.out.println("Empresas registradas:");
                        for (int i = 0; i < empresas.size(); i++) {
                            System.out.println((i + 1) + ". " + empresas.get(i).getNombre() + " - NIT: "
                                    + empresas.get(i).getNit());
                        }

                        int seleccion = -1;
                        Empresa empresaSeleccionada = null;

                        while (empresaSeleccionada == null) {
                            System.out.print("Seleccione una empresa por número: ");
                            try {
                                seleccion = Integer.parseInt(sc.nextLine()) - 1;
                                if (seleccion >= 0 && seleccion < empresas.size()) {
                                    empresaSeleccionada = empresas.get(seleccion);
                                } else {
                                    System.out.println("Número inválido. Intente nuevamente.");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("Entrada no válida. Ingrese un número.");
                            }
                        }

                        List<Empleado> empleados = opEmpleado.listarPorEmpresa(empresaSeleccionada.getNit());

                        if (empleados.isEmpty()) {
                            System.out.println("No hay empleados en esta empresa.");
                        } else {
                            System.out.println("Empleados en la empresa " + empresaSeleccionada.getNombre() + ":");
                            empleados.forEach(System.out::println);
                        }
                    } else {
                        System.out.println("No hay empresas registradas.");
                    }
                }

                case 10 -> System.out.println("Saliendo del programa");

                default -> System.out.println("Opción inválida.");
            }

        } while (opcion != 10);

        sc.close();
    }

}