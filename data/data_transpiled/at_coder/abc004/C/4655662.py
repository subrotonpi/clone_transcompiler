def import sys
class Main ( object ) :
    def __init__ ( self ) :
        dict = { }
        str = [ "123456" ]
        for i in range ( 30 ) :
            dict [ i ] = str
            x = i % 5
            y = x + 1
            tmp = str [ x ]
            str [ x ] = str [ y ]
            str [ y ] = tmp
    with open ( "/proc/main.py" , "r" ) as f :
        n = f.read ( ) % 30
        print ( dict [ n ] )
