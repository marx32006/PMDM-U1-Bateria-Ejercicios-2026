# Cinco «Hola mundo»

## Fragmento A

```dart
import 'package:flutter/material.dart';

void main() => runApp(const MiApp());

class MiApp extends StatelessWidget {
  const MiApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: Scaffold(body: Center(child: Text('Hola mundo'))),
    );
  }
}
```

## Fragmento B

```kotlin
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text("Hola mundo")
        }
    }
}
```

## Fragmento C

```html
<ion-header>
  <ion-toolbar>
    <ion-title>Inicio</ion-title>
  </ion-toolbar>
</ion-header>
<ion-content class="ion-padding">
  <h1>Hola mundo</h1>
  <ion-button (click)="saludar()">Saludar</ion-button>
</ion-content>
```

## Fragmento D

```csharp
public partial class MainPage : ContentPage
{
    public MainPage()
    {
        Content = new Label
        {
            Text = "Hola mundo",
            HorizontalOptions = LayoutOptions.Center
        };
    }
}
```

## Fragmento E

```swift
import SwiftUI

struct ContentView: View {
    var body: some View {
        Text("Hola mundo")
            .padding()
    }
}
```
