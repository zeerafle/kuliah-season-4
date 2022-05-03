# Navigasi

Navigasi merupakan kunci dari aplikasi berbasis mobile dimana user bisa pindah halaman. Flutter menyediakan kelas `Navigator`

![Navigasi dalam flutter mirip seperti stack](attachments/Pasted%20image%2020220426111904.png)

## Routes

Konsep page di Flutter disebut *Route*

![](attachments/2022-04-26-11-23-46.png)

Cara lain mendeskripsikan route

```dart
initialRoute: "/",
routes: {
    '/': (context) => const LoginPage(),
    '/dua': (context) => const SecondPage(),
    '/tiga': (context) => const ThirdPage(),
}
```

Sehingga saat menggunakan route cukup panggil sesuai namanya

```dart
Navigator.push(context, '/dua'),
```