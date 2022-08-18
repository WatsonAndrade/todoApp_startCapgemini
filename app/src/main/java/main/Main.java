/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.ProjectController;
import java.util.List;
import model.Project;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {    
 //       ProjectController projectController = new ProjectController();
        
 //       Project project = new Project();
 //       project.setName("Projeto teste");
 //       project.setDescription("Description");
 //       projectController.save(project);
        
        ProjectController projectController = new ProjectController();
        
        Project project = new Project();
        
        project.setId(1);
        project.setName("Novo nome do projeto");
        project.setDescription("Description");
        projectController.update(project);
        
       List<Project> projects = projectController.getAll();
       System.out.println("Total de projetos = " + projects.size() + " , nome: " + project.getName());
        
       projectController.removeById(1);
       System.out.println("Total de projetos = " + projects.size() + " , nome: " + project.getName());
    }
}
