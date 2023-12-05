def import scanner , writer
import sys
import os
import sys
class A ( object ) :
    def solve ( self ) :
        tc = scanner.randint ( )
        for tcc in range ( 1 , tc + 1 ) :
            self.writer.write ( "Case #%d: " % tcc )
            n , x = scanner.randint ( ) , scanner.randint ( )
            a = [ ]
            for i in range ( 1 , n + 1 ) :
                a.append ( scanner.randint ( ) )
            for i in range ( 1 , n + 1 ) :
                for j in range ( i + 1 , n + 1 ) :
                    if a [ i ] > a [ j ] :
                        tmp = a [ i ]
                        a [ i ] = a [ j ]
                        a [ j ] = tmp
            ans , r = 0 , n
            for i in range ( 1 , r + 1 ) :
                while r > i and a [ r ] + a [ i ] > x :
                    ans += 1
                    r -= 1
                if i == r :
                    ans += 1
                    break
                ans += 1
                r -= 1
            self.writer.write ( ans )
    def main ( ) :
        with open ( "A-large.in" , "r" ) as f :
            writer = open ( "output.txt" , "w" )
            self.solve ( )
            writer.close ( )
    class Scanner ( object ) :
        def __init__ ( self , scanner ) :
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
            self.scanner = scanner
    return Scanner ( )
