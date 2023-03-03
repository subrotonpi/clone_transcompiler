def import import sys
import random
import time
import sys
import random
import sys
import sys
import random
import sys
N = random.randint ( 1 , 10000 )
C = random.randint ( 1 , 10000 )
TIME = 100001
acc = [ [ 0 for s , t , c in [ ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ( '' , '' , '' ) , ]
def main ( ) :
    with open ( sys.argv [ 1 ] ) as f :
        for line in f :
            line = line.strip ( )
            if line.startswith ( '#' ) :
                continue
            if line.startswith ( '#' ) :
                continue
            yield line
