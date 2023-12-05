def _import ( ) : return
import os
import sys
import os
import sys
import os
import sys
import os
import sys
import os
import string
import string
import string
import sys
class A :
    def __init__ ( self ) :
        self.stdin = open ( 'A.in' , 'r' )
        self.stdout = open ( 'A.out' , 'w' )
        self.t = string.split ( string.strip ( ) )
        sys.stdin.readline ( )
        for tn in range ( t ) :
            self.stdout.write ( 'Case #%d: %s\n' % ( tn + 1 , solve ( self.stdin ) ) )
    def solve ( self , f ) :
        m = string.split ( string.strip ( ) )
        f.readline ( )
        s = ''
        for i in range ( m ) :
            ss = f.readline ( )
            s = s + '' + ss
        s = s.rstrip ( )
        self.input = s
        root = read_tree ( )
        res = ''
        n = string.split ( string.strip ( ) ) [ 0 ]
        for i in range ( n ) :
            name , k = string.split ( string.strip ( ) )
            features = set ( [ name ] )
            res += '\n' + calc ( root , features )
        return res
    def calc ( tree , features ) :
        if not tree.feature :
            return tree.p
        else :
            return tree.p * calc ( ( tree.left if tree.feature in features else tree.rigth ) , features )
    def read_tree ( ) :
        input = string.split ( string.strip ( ) )
        i = 0
        while '0123456789.' in input [ i ] :
            i += 1
        p = float ( input [ : i ] )
        if input [ i ] == ')' :
            input = input [ i ]
            res = ( p , None , None )
        else :
            input = input [ i : ]
            i = 0
            while input [ i ] != '(' :
                i += 1
        return res
