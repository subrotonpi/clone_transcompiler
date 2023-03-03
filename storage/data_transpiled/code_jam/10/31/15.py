def import _csv
import os
import csv
import os
import sys
import csv
import sys
class A ( object ) :
    input , output = sys.argv [ 1 ] , sys.argv [ 2 ]
    with open ( input , 'r' ) as f :
        reader = csv.reader ( f )
        writer = csv.writer ( writer )
        TestCases = reader.next ( )
        for Case in range ( 1 , TestCases + 1 ) :
            writer.write ( "Case #%d: " % Case )
            Wires = reader.next ( )
            A , B = [ ] , [ ]
            count = 0
            for i in range ( Wires ) :
                A.append ( reader.next ( ) )
                B.append ( reader.next ( ) )
                for j in range ( i ) :
                    if A [ i ] > A [ j ] and B [ i ] < B [ j ] or A [ i ] < A [ j ] and B [ i ] > B [ j ] :
                        count += 1
            writer.write ( "%d" % count )
            writer.write ( "\n" )
