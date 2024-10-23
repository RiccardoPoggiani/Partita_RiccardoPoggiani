# Partita di Pallavolo

Riccardo Poggiani  
5AINF  
2024/25  

---

### Scopo del Progetto

Il progetto **Partita di Pallavolo** simula una partita di pallavolo in cui due giocatori si alternano nel passare la palla. Ogni giocatore tiene traccia del numero di passaggi effettuati e utilizza i thread per gestire la concorrenza nella simulazione. L'obiettivo è mostrare come diversi thread possano interagire e lavorare in parallelo.

---

### Classi Principali

1. **Giocatore**: Rappresenta un giocatore nella partita di pallavolo.
   - **Attributi**:
     - `id`: ID del giocatore.
     - `numeroPassaggi`: Numero totale di passaggi effettuati dal giocatore.
   - **Metodi**:
     - `getId()`: Restituisce l'ID del giocatore.
     - `getNumeroPassaggi()`: Restituisce il numero di passaggi effettuati dal giocatore.
     - `run()`: Metodo eseguito dal thread del giocatore, che simula il passaggio della palla.

2. **PartitaPallavolo**: Classe principale che avvia la simulazione della partita.
   - **Metodi**:
     - `main()`: Punto di ingresso dell'applicazione che crea e avvia i thread dei giocatori.

---

### Flusso di Esecuzione

1. Vengono creati due oggetti `Giocatore`, ognuno con un ID unico.
2. Vengono creati due thread, uno per ciascun giocatore.
3. I thread vengono avviati, e ciascun giocatore inizia a passare la palla in un ciclo infinito.
4. Ogni volta che un giocatore riceve la palla, incrementa il proprio conteggio dei passaggi e stampa a schermo il numero attuale di passaggi.
5. Ogni thread dorme per 1 secondo dopo ogni passaggio, permettendo agli altri thread di eseguire.

---

### Librerie Utilizzate

Il progetto utilizza le seguenti librerie standard di Java:
- `java.lang.Thread`: Per la gestione dei thread e della loro esecuzione.
- `java.lang.Runnable`: Per implementare il comportamento dei thread.
- `java.lang.InterruptedException`: Gestisce l'eccezione che si verifica se un thread viene interrotto mentre è in attesa.

---

### Esempio di Esecuzione

Quando il programma viene eseguito, il risultato potrebbe apparire simile al seguente:

```
idGiocatore: 1, priorità: 10, nome: Thread-0
Giocatore 1 è a quota 0 passaggi e ha ricevuto la palla.
Giocatore 1 ha passato la palla: è a quota 1 passaggi.
Giocatore 2 è a quota 0 passaggi e ha ricevuto la palla.
Giocatore 2 ha passato la palla: è a quota 1 passaggi.
...
```

I messaggi continueranno a essere stampati finché il programma è in esecuzione, mostrando l'alternanza dei passaggi tra i due giocatori.

---