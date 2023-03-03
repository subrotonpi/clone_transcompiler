def import _readline
import readline
import readline
import time
import sys
import readline
import readline
import readline
import readline
import readline
import time
import sys
class Main ( readline ) :
    def readline ( self ) :
        return int ( readline ( self ) )
    def readline ( self ) :
        return long ( readline ( self ) )
    def readline ( self ) :
        return float ( readline ( self ) )
    def readline ( self ) :
        return readline ( self )
    def readline ( self ) :
        return readline ( self )
    def readline ( self ) :
        return readline ( self )
class Dir ( ) :
    sub_dir = { }
    def add_sub_dir ( name ) :
        to_add = Dir ( )
        sub_dir [ name ] = to_add
        return to_add
    def has_sub_dir ( name ) :
        return name in sub_dir
    def get_sub_dir ( name ) :
        return sub_dir [ name ]
    def run ( self ) :
        try :
            locale.setlocale ( locale.LC_ALL , '' )
            f = open ( 'in.txt' , 'r' )
            out = open ( 'out.txt' , 'w' )
            T = randint ( 0 , T )
            for cases in range ( T ) :
                n , m = randint ( 0 , M )
                res = 0
                root = Dir ( )
                for i in range ( n ) :
                    cur_dir = root
                    dirname = f.readline ( )
                    w = dirname.split ( '/' )
                    for w in w [ 1 : ] :
                        if cur_dir.has_sub_dir ( w [ 0 ] ) :
                            cur_dir = cur_dir.get_sub_dir ( w [ 0 ] )
                        else :
                            cur_dir = cur_dir.get_sub_dir ( w [ 0 ] )
                for i in range ( m ) :
                    cur_dir = root
                    dirname = f.readline ( )
                    w = dirname.split ( '/' )
                    for w in w [ 1 : ] :
                        if cur_dir.has_sub_dir ( w [ 0 ] ) :
                            cur_dir = cur_dir.get_sub_dir ( w [ 0 ] )
                        else :
                            cur_dir = cur_dir.get_@@