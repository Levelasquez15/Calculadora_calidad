# Imagen base: Maven 3.9.9 con Temurin JDK 17
FROM maven:3.9.9-eclipse-temurin-17

# Instala Node.js 18 (requerido por act para ejecutar actions)
RUN apt-get update && \
    apt-get install -y curl && \
    curl -fsSL https://deb.nodesource.com/setup_18.x | bash - && \
    apt-get install -y nodejs && \
    apt-get clean && rm -rf /var/lib/apt/lists/*

# Directorio de trabajo dentro del contenedor
WORKDIR /workspace

# Mantén el contenedor en ejecución (útil para depurar con act)
CMD ["sleep", "infinity"]
