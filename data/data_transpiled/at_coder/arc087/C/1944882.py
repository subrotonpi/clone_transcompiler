def import java.io.StringIO
import sys
from java.io import StringIO
import Tree
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.__next__ ( )
        L = sc.__next__ ( )
        s = [ ]
        tree = Tree ( )
        for i in range ( n ) :
            s.append ( sc.next ( ) )
            tree.set ( s [ i ] )
        tree.dfs ( tree.root )
        if grundy == 0 :
            print ( "Bob" )
        else :
            print ( "Alice" )
    grundy = 0
    L = 0
    class Tree ( Node ) :
        def __init__ ( self ) :
            self.root = Node ( )
        def set ( self , s ) :
            cur = self.root
            for i in s :
                if i == '0' :
                    cur.append_left ( )
                    cur = cur.left
                elif i == '1' :
                    cur.append_right ( )
                    cur = cur.right
            cur.hit ( )
        def dfs ( self , cur ) :
            if self.hit > 0 :
                return
            if self.left :
                dfs ( self.left )
            else :
                grundy ^= ( L - self.depth ) & - ( L - self.depth )
            if self.right :
                dfs ( self.right )
            else :
                grundy ^= ( L - self.depth ) & - ( L - self.depth )
    class Node ( Node ) :
        def __init__ ( self , right = None ) :
            self.right = left = right = None
            self.hit = 0
            self.depth = 0
            def append_left ( self ) :
                if self.left is None :
                    self.left = Node ( )
                    self.depth = self.depth + 1
            def append_right ( self ) :
                if self.right is None :
                    self.right = Node ( )
                    self.depth = self.depth + 1
            def hit ( self ) :
                self.hit += 1
    def tr ( self , * args ) :
        print ( "".join