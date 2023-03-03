def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 1000000000
        self.ans = 1000000000
        self.memo = [ ]
        self.dp = [ ]
    def main ( self ) :
        sc = _main.raw_input ( )
        k = sc.split ( )
        num = 0
        for i in range ( len ( k ) - 4 ) :
            if k [ i ] == 'B' and k [ i + 2 ] == 'B' and k [ i + 4 ] == 'B' :
                num = i
                break
        if num == 6 :
            print ( 'Do' )
            return
        elif num == 4 :
            print ( 'Re' )
            return
        elif num == 2 :
            print ( 'Mi' )
            return
        elif num == 1 :
            print ( 'Fa' )
            return
        elif num == 11 :
            print ( 'So' )
            return
        elif num == 9 :
            print ( 'La' )
            return
        elif num == 7 :
            print ( 'Si' )
class Pair ( object ) :
    def __init__ ( self ) :
        from time import time
        self.end = time ( )
    def __lt__ ( self , other ) :
        otherpair = other.start ( )
        return self.end - otherpair.end
return Main
