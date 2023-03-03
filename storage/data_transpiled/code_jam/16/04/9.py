def import import _io
import os
import sys
class Round0D :
    def process ( self , file , out ) :
        cases = self.cases
        self.stdout = open ( file , 'w' )
        for cur_case in range ( cases ) :
            K = self.stdout.read ( )
            C = self.stdout.read ( )
            S = self.stdout.read ( )
            if C * S < K :
                out.write ( "Case #%d: IMPOSSIBLE\n" % ( cur_case + 1 ) )
            else :
                out.write ( "Case #%d:\n" % ( cur_case + 1 ) )
                k = 0
                for s in range ( S ) and k < K :
                    num = 0
                    for i in range ( C ) :
                        num = num * K + ( k % K )
                        k += 1
                    out.write ( ' ' )
                    out.write ( num + 1 )
                out.write ( '\n' )
    def round_0D ( self ) :
        with open ( "C:\\Users\\Olaf\\Downloads\\D-large.in" , "r" ) as infile :
            with open ( "out-D-large.txt" , "w" ) as outfile :
                self.process ( infile , outfile )
    def main ( self ) :
        super ( Round0D , self ).process ( )
