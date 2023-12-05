def round3 ( ) :
    import os
    import sys
    import os
    import sys
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import time
    import time
    import sys
    class B :
        class Niz :
            def __init__ ( self , element ) :
                self.duzina = 1
                self.zadnji = element
        def __init__ ( self ) :
            self.duzina = 0
            self.duzina = 0
            self.duzina = 0
            self.duzina = 0
    def main ( ) :
        with open ( 'B.in' , 'r' ) as infile :
            with open ( 'B.out' , 'w' ) as outfile :
                tt = infile.read ( )
                for ttt in range ( 1 , tt + 1 ) :
                    n = infile.read ( )
                    t = [ infile.read ( ) ]
    for ttt in range ( 1 , tt + 1 ) :
        n = infile.read ( )
        t = [ infile.read ( ) ]
        res = 0
        if n > 0 :
            t = t [ : n ]
            nizovi = [ ]
            for i in range ( n ) :
                a = None
                for niz in nizovi :
                    if niz.zadnji == t [ i ] - 1 and ( not a or a.duzina > niz.duzina ) :
                        a = niz
                    if not a :
                        nizovi.append ( ( t [ i ] ) )
                    else :
                        a.duzina += 1
                        a.zadnji = t [ i ]
            res = n
            for niz in nizovi :
                if niz.duzina < res :
                    res = niz.duzina
            outfile.write ( 'Case #%d: %d\n' % ( ttt , res ) )
            outfile.write ( '\n' )
