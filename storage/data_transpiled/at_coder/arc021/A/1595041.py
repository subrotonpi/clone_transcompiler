def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a = [ ]
    def input ( self ) :
        Scanner ( ).input ( )
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                self.a [ i ].append ( scanner.next ( ) )
    def main ( self , args ) :
        self.input ( )
        flag = False
        for i in range ( 4 ) :
            for j in range ( 4 ) :
                if j != 3 and self.a [ i ] [ j ] == self.a [ i ] [ j + 1 ] :
                    flag = True
                    break
                if j != 3 and self.a [ j ] [ i ] == self.a [ j + 1 ] [ i ] :
                    flag = True
                    break
        if flag :
            print ( "CONTINUE" )
        else :
            print ( "GAMEOVER" )
