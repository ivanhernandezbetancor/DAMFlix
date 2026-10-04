## 🎯 Objetivo

Diseñar la primera pantalla de la aplicación **DAMFlix**, creando la interfaz estática del perfil del usuario y la ficha de bienvenida.

## ✅ Requisitos funcionales

| Requisito | Cómo se cumple |
|---|---|
| **1. Cabecera de usuario** | Imagen de avatar redonda con `Modifier.clip(CircleShape)` y borde personalizado con `Modifier.border()` |
| **2. Información general** | Nombre del usuario, rol ("Crítico de Cine") y estadísticas estáticas (42 películas vistas, 12 reseñas) |
| **3. Sin cadenas hardcoded** | Todos los textos están en `strings.xml` y se leen con `stringResource()` |

## ⚙️ Funcionamiento

La pantalla se construye con tres composables, cada uno con una responsabilidad:

1. **`CabeceraUsuario()`**: Carga la imagen `user_avatar` desde `res/drawable`, la recorta en círculo y le pone borde.
2. **`InfoUsuario()`**: Usa un `Column` con el nombre, el rol y, en un `Row`, las dos estadísticas. Los números (42 y 12) se pasan como parámetro a los textos `%1$d` de `strings.xml`.
3. **`PerfilUsuario()`**: Junta los dos anteriores en un `Row`: avatar a la izquierda e información a la derecha.

`MainActivity` llama a `PerfilUsuario()` dentro de `setContent { MaterialTheme { ... } }`, que es el punto de entrada de la app.

## 🗂️ Estructura

```
app/src/main
├── java/com/example/damflix
│   └── MainActivity.kt        # CabeceraUsuario, InfoUsuario y PerfilUsuario
└── res
    ├── drawable
    │   └── user_avatar.png    # Imagen del avatar
    └── values
        └── strings.xml        # Textos de la interfaz
```
