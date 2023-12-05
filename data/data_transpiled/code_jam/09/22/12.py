def import _readline
import locale
import readline
import sys
class B ( object ) :
    def __init__ ( self ) :
        self.file_name = 'b'
        self.input_file_name = self.file_name + '.in'
        self.output_file_name = self.file_name + '.out'
    def readline ( self ) :
        self.in_file = open ( self.input_file_name , 'r' )
        self.out_file = open ( self.output_file_name , 'w' )
    def next_permutation ( permutation ) :
        free = [ ]
        for i in permutation [ : - 1 ] :
            current = permutation [ i ]
            for j in range ( len ( free ) ) :
                if free [ j ] > current :
                    permutation [ i ] = free [ j ]
                    free [ j ] = current
                    free.sort ( )
                    for k in range ( i + 1 , len ( permutation ) ) :
                        permutation [ k ] = free [ k - i - 1 ]
                    return
            free.append ( current )
            permutation.sort ( )
        return permutation
    def solve ( self ) :
        t = self.input
        perm = [ t - '0' for i in range ( len ( t ) + 1 ) ]
        next_permutation ( perm )
        buf = [ ]
        for i in perm :
            buf.append ( i )
        res = ''.join ( buf )
        if res.startswith ( '0' ) :
            res = res [ 1 : ]
        self.out_file.write ( res )
    def run ( self ) :
        try :
            tests = self.raw_input ( )
            self.in_file = open ( self.file_name , 'r' )
            for t in range ( 1 , tests + 1 ) :
                self.out_file.write ( 'Case #%d: ' % t )
                self.solve ( )
        finally :
            self.in_file.close ( )
            self.out_file.close ( )
