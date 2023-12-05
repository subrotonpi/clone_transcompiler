def import sys , buf
import string
import string
import sys
class buf ( string ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.cass = string.split ( string.punctuation ) [ 0 ]
        self.cas = int ( self.cass )
for c in range ( cas ) :
    print ( "Case #%d: " % ( c + 1 ) , end = "" )
    bleh = string.split ( string.punctuation )
    count = len ( bleh )
    count_av = count
    chosen = [ False ] * count
    output = [ ]
    out_in = 0
    while 1 :
        best = 'A'
        index = - 1
        for j in range ( count - 1 , - 1 , - 1 ) :
            if bleh [ j ] > best :
                best = bleh [ j ]
                index = j
        output.append ( best )
        chosen.append ( True )
        count = index
        if not index :
            break
    for m in range ( out_in ) :
        print ( output [ m ] , end = "" )
    for m in range ( count_av ) :
        if not chosen [ m ] :
            print ( bleh [ m ] , end = "" )
        print ( )
