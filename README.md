# 🧪 Experiencia de Automatización con Jenkins

Este proyecto consistió en la automatización de un proceso de construcción utilizando Jenkins, integrando distintas herramientas para simular un flujo de integración continua (CI).

---

## ✅ ¿Qué beneficios concretos vimos al automatizar la construcción con Jenkins?

- Reducción del tiempo dedicado a tareas manuales como compilación y pruebas.
- Detección temprana de errores tras cada cambio en el código.
- Visibilidad clara del estado del proyecto (logs, historial de builds, errores).
- Ejecución constante y reproducible del proceso de construcción.

---

## ✅ ¿Qué parte del proceso sería más crítica en un equipo grande?

- La **integración continua (CI)** para evitar conflictos al integrar múltiples cambios.
- La **ejecución de pruebas automatizadas**, clave para mantener la calidad del software.
- La **comunicación del estado de los builds**, para mantener al equipo informado ante errores o fallos.

---

## ✅ ¿Cómo Jenkins asegura la calidad antes de hacer despliegues?

- Realizando compilaciones desde cero en cada ejecución.
- Ejecutando pruebas automatizadas (unitarias y de integración).
- Posibilidad de análisis de calidad con herramientas como **SonarQube**.
- Validando que todas las etapas del pipeline se completen correctamente antes del despliegue.

---

## ✅ ¿Qué cambiaríamos en este pipeline para prepararlo para producción?

- Agregar **más etapas de pruebas automatizadas** y cobertura de código.
- Incluir **análisis estático de código** (ej. SonarQube).
- Incorporar un sistema de **aprobaciones manuales** previo a producción.
- Separar despliegues en ambientes: desarrollo, staging y producción.
- Integrar **notificaciones automáticas** (por correo, Slack, etc.) en caso de errores.

---

## 🧑‍💻 Nuestra experiencia

### ¿Qué aprendimos?

- A configurar Jenkins y pipelines declarativos.
- A integrar Jenkins con Git y automatizar procesos de construcción.
- A manejar errores comunes en entornos automatizados.
- A estructurar un pipeline que refleje buenas prácticas de CI/CD.

### ¿Qué nos sorprendió más?

- La facilidad de automatizar tareas repetitivas con Jenkins.
- El impacto de un pequeño error en el código dentro de un pipeline automatizado.
- La capacidad de Jenkins para adaptarse a distintas necesidades y entornos.

---

![Vista del pipeline](Pictures/jenkins.png)

🚀 *Este ejercicio fue una introducción práctica al uso de Jenkins como herramienta clave en DevOps, permitiéndonos experimentar los beneficios reales de la automatización desde el primer momento.*
