def _import ( ) : return sys.stdin
import StringIO
import getopt
import getopt
import getopt
import os
import sys
from getopt import getopt
from getopt import getopt
def main ( ) :
    fh = sys.stdin
    stdout = sys.stdout
    sys.stderr = open
    getopt.getopt ( sys.argv [ 1 : ] , 'r' )
    try :
        fp = open ( fp , 'rb' )
    except IOError :
        return None
    for line in fp :
        try :
            rl = getopt.getopt ( line , 'r' )
        except getopt.error :
            return None
        fp.write ( '%d: %d\n' % ( len ( fp ) , len ( fp ) ) )
    def read ( ) : return int ( fp.read ( ) )
def _import ( ) :
    while True or not fp :
        try :
            rl = getopt.getopt ( fp , 'r' )
        except IOError :
            return None
        fp = open ( fp , 'wb' )
    solver = TaskC ( )
    solver.solve ( 1 , read , _import )
    return solver.solve ( 2 , read , _import )
class TaskC ( object ) :
    def __init__ ( self ) :
        self.ok = True
    def solve ( self , test_number , f , g ) :
        n = self.n
        adj = [ [ ] for _ in range ( self.n ) ]
        a = [ f [ 0 ] for _ in range ( self.n ) ]
        for u in range ( self.n - 1 ) :
            v = self.n - 1
            adj [ u ].append ( v )
            adj [ v ].append ( u )
        if len ( self.n ) == 2 :
            g.write ( 'YES' if self.a [ 0 ] == a [ 1 ] else 'NO' )
            return
        root = - 1
        for i in range ( self.n ) :
            if len ( self.adj [ i ] ) > 1 :
                root = i
                break
        if root < 0 :
            raise AssertionError
        self.ok = True
        excess = self.dfs ( root , - 1 , adj , a )
        return