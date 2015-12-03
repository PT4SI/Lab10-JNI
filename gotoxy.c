// gotoxy.c
#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
void gotoxy(int x, int y) {
    COORD coord;
coord.X = x;
coord.Y = y; SetConsoleCursorPosition(GetStdHandle(STD_OUTPUT_HANDLE), coord);
}
int main() {
system("cls"); // clear the screen
gotoxy(2, 10); // set position of cursor to (2, 10) printf("Hello from Visual C!");
}