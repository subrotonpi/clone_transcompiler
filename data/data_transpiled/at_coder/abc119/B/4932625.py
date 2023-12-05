def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.yen = 0
        self.btc = 0.
        with open ( "input.txt" , "r" ) as sc :
            N = sc.read ( )
            for i in range ( N ) :
                x , u = sc.read ( ).split ( " " )
                if u.strip ( ) == "JPY" :
                    self.yen += x
                else :
                    self.btc += x
        print ( "%f" % ( self.yen + 380000 * self.btc ) )
