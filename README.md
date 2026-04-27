<div align="center">

# 🏨 Sistema de Gestión Hospitalaria

### Spring Boot · JPA · Hibernate · Thymeleaf · MySQL · Maven

![Java](https://img.shields.io/badge/Java_17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate_JPA-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

</div>

---

## 📌 ¿Qué hace este proyecto?

Aplicación web de gestión hospitalaria construida con Spring Boot y arquitectura MVC. Permite administrar pacientes, médicos, hospitalizaciones y el flujo de atención médica, con persistencia relacional mediante JPA/Hibernate e interfaz Thymeleaf.

---

## 🏗️ Arquitectura MVC

```
[Thymeleaf Views]
       │
       ▼
[Spring Controllers]   ← Endpoints web de cada módulo
       │
       ▼
[Service Layer]        ← Lógica hospitalaria y validaciones
       │
       ▼
[JPA Repositories]     ← Acceso a datos con Spring Data
       │
       ▼
[MySQL Database]       ← Pacientes, médicos, camas, hospitalizaciones
```

---

## ✨ Funcionalidades

- 👤 **Pacientes**: registro, historial clínico y estado
- 👨‍⚕️ **Médicos**: gestión por especialidad y servicio
- 🛏️ **Hospitalizaciones**: asignación de camas y seguimiento
- 📋 **Atenciones**: registro de consultas y diagnósticos
- 🔗 Relaciones JPA entre entidades del dominio hospitalario

---

## 🗂️ Estructura del proyecto

```
proyectoHospital/
└── src/
    ├── main/
    │   ├── java/
    │   │   └── com/hospital/
    │   │       ├── controller/    # Controladores Spring MVC
    │   │       ├── model/         # Entidades JPA
    │   │       ├── repository/    # Repositorios Spring Data
    │   │       └── service/       # Lógica de negocio
    │   └── resources/
    │       ├── templates/         # Vistas Thymeleaf
    │       └── application.properties
    └── test/
```

---

## 🗄️ Modelo de datos

```
Paciente (1) ──── (N) Hospitalizacion ──── (1) Cama
  - nombre              - paciente_id           - numero
  - rut                 - medico_id             - servicio
  - edad                - fecha_ingreso         - disponible
                        - fecha_alta
                        - diagnostico

Medico (1) ──── (N) Hospitalizacion
  - nombre
  - especialidad
  - servicio
```

---

## ⚙️ Requisitos

- Java 17+
- Maven 3.8+
- MySQL 8+

---

## 🚀 Instalación y ejecución

```bash
# 1. Clonar el repositorio
git clone https://github.com/LujoMontero/proyectoHospital.git
cd proyectoHospital

# 2. Crear la base de datos
mysql -u root -p
CREATE DATABASE hospital_db;
EXIT;

# 3. Configurar application.properties
spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# 4. Ejecutar la aplicación
mvn spring-boot:run

# 5. Abrir en el navegador
open http://localhost:8080
```

---

## 💡 Conceptos aplicados

| Concepto | Uso en el proyecto |
|---|---|
| `@Entity` / `@Table` | Entidades del dominio hospitalario |
| `@OneToMany` / `@ManyToOne` | Relación Médico → Hospitalizaciones |
| `@OneToOne` | Relación Cama ↔ Hospitalización activa |
| `JpaRepository` | CRUD y consultas automáticas |
| `@Transactional` | Integridad en alta/baja de pacientes |

---

## 👨‍💻 Autor

**Luis Montero** · [GitHub](https://github.com/LujoMontero) · [LinkedIn](https://www.linkedin.com/in/luis-montero-if/)
