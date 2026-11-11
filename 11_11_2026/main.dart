import 'package:flutter/material.dart';
import 'controllers/tarefa_controller.dart';
import 'repositories/tarefa_repositorio_memoria.dart';
import 'screens/tela_todo_list.dart';

void main() {
  final repositorio = TarefaRepositorioMemoria();
  final controller = TarefaController(repositorio);

  runApp(MyApp(controller: controller));
}

class MyApp extends StatelessWidget {
  final TarefaController controller;

  const MyApp({super.key, required this.controller});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        useMaterial3: false,
        primarySwatch: Colors.blue,
      ),
      home: TelaTodoList(controller: controller),
    );
  }
}
