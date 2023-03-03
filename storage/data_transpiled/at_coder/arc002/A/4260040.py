def import import sys , string , traceback ;
from tkinter import Tk , Text , Text , Text
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        sc = ScrolledCanvas ( dict ( master = self.master , text = string , indent = 4 ) )
        self.text = Text ( sc )
        y = sc.takewhile ( lambda x : x % 4 == 0 , args )
        if y % 4 :
            self.out.value = 'NO'
        else :
            if y % 16 == 0 :
                self.out.value = 'YES'
            elif y % 25 == 0 :
                self.out.value = 'NO'
            else :
                self.out.value = 'YES'
