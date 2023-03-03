def _import ( * args ) : return
import sys
import os
import sys
import pickle
import pickle
import pickle
import pickle
class Main :
    def __init__ ( self ) :
        self.gen = 0
    def __init__ ( self ) :
        self.gen = gen
        self.stones = self.gen
        self.id = self.id
    def dfs ( self , parent ) :
        if len ( self.adj ) == 1 :
            return self.stones
        sum = max = 0
        for v in self.adj :
            if v is parent :
                continue
            got = v.dfs ( self )
            sum += got
            max = max ( max , got )
        next_path_num = 2 * self.stones - sum
        max = max ( max , next_path_num )
        if next_path_num < 0 :
            return - 1
        if 2 * max > 2 * self.stones :
            return - 1
        return next_path_num
    def main ( self ) :
        with open ( self.path , 'r' ) as sc :
            N = sc.readline ( ).split ( ) [ 1 ]
            vs = [ Vertex ( sc.readline ( ) ) for _ in range ( N ) ]
            a = [ ]
            b = [ ]
            for v in vs :
                a.adj.append ( b )
                b.adj.append ( a )
            if N == 2 :
                if self.stones == self.stones :
                    print ( "YES" )
                else :
                    print ( "NO" )
                return
            root = None
            for v in self.adj :
                if len ( v.adj ) > 1 :
                    root = v
                    break
            path_num = root.dfs ( None )
            if path_num == 0 :
                print ( "YES" )
            else :
                print ( "NO" )
    def tr ( self , * args ) :
        print ( pickle.dumps ( self , * args ) )
