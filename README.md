# Eigene Exceptions
In Java können benutzerdefinierte (eigene) Exceptions erstellt werden, um spezifische Fehlerbedingungen in einem Programm zu behandeln. Dies ermöglicht eine präzisere Fehlerbehandlung und verbessert die Lesbarkeit des Codes.

# Aufgabenstellung
Erstellen Sie eine Java-Anwendung, die eine einfache Buchverwaltung simuliert. Implementieren Sie eine eigene Exception-Klasse für den Fall, dass versucht wird, ein Buch mit ungültigen Werten hinzuzufügen.

## Vorbereitende Aufgaben
Informieren Sie sich [hier](https://falconbyte.net/exception-handling) und [hier](https://falconbyte.net/eigene-exceptions-erstellen) über Exceptions sowie das Thema "eigene Exceptions erstellen".

## Arbeitsauftrag
1. **Synchronisieren:**
   - Synchronisieren Sie das Git-Repository. Verwenden Sie wahlweise `git clone`, um das Projekt ins Workspace zu clonen, und erstellen Sie anschließend ein Projekt in der IDE oder führen Sie dies manuell durch.

2. **Programm Testen:**
   - Es ist bereits eine Klasse `UngueltigerPreisException` vorhanden, die "geworfen" wird, wenn versucht wird, ein Buch mit einem Preis kleiner als 0 hinzuzufügen. Schreiben Sie ein Testprogramm, das die Buchverwaltung nutzt und versucht, Bücher mit gültigen und ungültigen Preisen hinzuzufügen. Fangen Sie die `UngueltigerPreisException` ab und geben Sie die Fehlermeldung aus, indem Sie die Methode `printStackTrace()` des erzeugten Exception-Objekts aufrufen.

3. **Eigene Exception-Klasse erstellen:**
   - Es sollen nun auch ungültige Eingaben beim Titel und Autor mit Exceptions geprüft werden. Erstellen Sie hierzu eine neue Klasse `UngueltigerStringException`. Eine `UngueltigerPreisException` soll dann geworfen werden, wenn ein String mit weniger als drei Zeichen eingegeben wird.

4. **Vorhandene Methode überschreiben:**
   - Die beiden Exception-Klassen erben von `Exception` und können somit die Methoden der Vaterklasse überschreiben. Überschreiben Sie die `getMessage()`-Methode in den beiden Exception-Klassen. Diese Methode soll einen String zurückliefern, der Informationen zu dem aufgetretenen Fehler enthält.

5. **Programm Testen:**
   - Erweitern Sie Ihr Testprogramm. Im `catch`-Block soll nun ebenfalls die `getMessage()`-Methode aufgerufen und der Rückgabewert am Bildschirm ausgegeben werden. Verwenden Sie ggf. mehrere Catch-Blöcke.

6. **Pushen:**
   - Pushen Sie Ihre Lösung auf den remote Main Branch ( git push origin main)
   
