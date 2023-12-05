def year2016.round1a ( ) :
    import os
    import sys
    import random
    import string
    class TheLastWord ( string ) :
        def __init__ ( self ) :
            self.inputFile = 'A-large.in'
            with open ( self.inputFile , 'r' ) as infile :
                self.outputFile = open ( self.outputFile , 'w' )
                self.T = len ( infile )
                for t , s in enumerate ( infile ) :
                    answer = solve ( s )
                    self.outputFile.write ( 'Case #{}: {}\n'.format ( t + 1 , answer ) )
    def solve ( s ) :
        s = string.split ( s )
        if len ( s ) == 0 :
            return ''
        else :
            max = s [ 0 ]
            for c in s :
                max = chr ( max )
            last = s [ - 1 ]
            if max == last :
                return last + solve ( s [ : - 1 ] )
            else :
                return solve ( s [ : - 1 ] ) + last
