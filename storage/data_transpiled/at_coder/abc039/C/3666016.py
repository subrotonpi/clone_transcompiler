def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.S = sys.stdin.read ( )
    def doremi ( self ) :
        for i in range ( 20 ) :
            if self.S [ i ] == 'W' :
                doremi ( 0 )
            else :
                doremi ( 1 )
        num = - 1
        for i in range ( 16 ) :
            if doremi ( i ) * doremi ( i + 2 ) * doremi ( i + 4 ) == 1 :
                num = i + 1
                break
        if num % 12 == 1 or num % 12 == 2 :
            print ( 'Fa' )
        elif num % 12 == 3 :
            print ( 'Mi' )
        elif num % 12 == 4 or num % 12 == 5 :
            print ( 'Re' )
        elif num % 12 == 6 or num % 12 == 7 :
            print ( 'Do' )
        elif num % 12 == 8 :
            print ( 'Si' )
        elif num % 12 == 9 or num % 12 == 10 :
            print ( 'La' )
        elif num % 12 == 11 or num % 12 == 0 :
            print ( 'So' )
