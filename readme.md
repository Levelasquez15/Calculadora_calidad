# 🧮 Calculadora_Calidad – Taller 2


---

## 📌 Descripción
Aplicación simple de **calculadora** desarrollada en **Java 17**, con pruebas unitarias en **JUnit 5**  
e integración continua (CI) configurada con **GitHub Actions** y ejecutada localmente con [`act`](https://github.com/nektos/act).

---

## 🚀 Requisitos previos

- [Docker Desktop](https://www.docker.com/products/docker-desktop/) instalado y en ejecución  
- [act](https://github.com/nektos/act) instalado  
- Git configurado en tu sistema  
- (Opcional) Maven instalado localmente para compilar y probar sin contenedor

---

## 📂 Estructura del proyecto

Calculadora_Calidad/
├── Calculadora_calidad/
│ ├── pom.xml
│ └── src/
│ ├── main/java/...
│ └── test/java/...
├── .github/workflows/ci.yml
├── Dockerfile
└── README.md