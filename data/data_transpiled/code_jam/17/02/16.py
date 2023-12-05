def year2017.qualification ( ) :
    import os
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import sys
    class TidyNumbers ( TidyNumbers ) :
        def __init__ ( self ) :
            super ( TidyNumbers , self ).__init__ ( )
            self.inputFile = open ( 'B-large.in' , 'r' )
            self.outputFile = open ( 'output.txt' , 'w' )
            self.T = len ( self.inputFile )
    for t in range ( T ) :
        c = csv.reader ( TidyNumbers )
        for i in range ( len ( c ) - 2 , - 1 , - 1 ) :
            if c [ i ] > c [ i + 1 ] :
                c [ i ] -= 1
                for j in range ( i + 1 , len ( c ) ) :
                    c [ j ] = '9'
        offset = ( 1 if c [ 0 ] == '0' else 0 )
        answer = c [ offset : - offset ]
        print ( 'Case #{}: {}'.format ( t + 1 , answer ) , file = sys.stderr )
