def round_1B_2010 ( ) :
    import os
    import sys
    import csv
    import csv
    import csv
    import csv
    import csv
    import sys
    class RopeIntranet ( Intranet ) :
        def __init__ ( self ) :
            self.reader = csv.reader ( sys.stdin )
        def write ( self , file ) :
            self.writer = csv.writer ( file , delimiter = '\t' )
            t = self.reader.count ( )
            for cc in range ( 1 , t + 1 ) :
                n = self.reader.count ( )
                lines = [ line ( a = self.reader.read ( ) , b = self.reader.read ( ) ) for i in range ( n ) ]
                result = 0
                for i in range ( n ) :
                    for j in range ( i + 1 , n ) :
                        if ( lines [ i ].a - lines [ j ].a ) * ( lines [ i ].b - lines [ j ].b ) < 0 :
                            result += 1
                f.write ( 'Case #%d: %.2f\r\n' % ( cc , result ) )
                f.flush ( )
    class line ( Intranet ) :
        a = 0
        b = 0
