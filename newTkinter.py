from tkinter import*
import tkinter as tk

win = tk.Tk()

w=500;h=500;x=200;y=200
win.geometry(f"{w}x{h}+{x}+{y}")
win.config(bg='grey')

L1=Label(win,bg="blue", fg="red", width=30,height=2,border=8,relief='groove' ,text="Label 1")
L1.pack(fill="both")

L2=Label(win,bg="orange", fg="yellow", width=30,height=2,border=8,relief='raised',padx=10,pady=5 ,text="Label 2")
L2.pack(fill= "x")

L3=Label(win,bg="yellow", fg="red", width=30,height=2,border=8,relief='sunken' ,text="Label 3")
L3.pack(fill='y',expand=True)


L4=Label(win,bg="yellow", fg="red", width=30,height=2,border=8,relief='sunken' ,text="Label 4")
L4.pack(fill="none")

win.mainloop()




