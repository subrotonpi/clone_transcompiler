def _ ( ) : return 'Yes'
import sys
import os
import sys
import random
import string
import string
import string
import string
import sys
class Q1 ( string ) :
    def __init__ ( self ) :
        self.num_tests = int ( sys.stdin.readline ( ) )
        for test in range ( num_tests ) :
            print ( 'Case #%d: %s' % ( test + 1 , self.get_result ( ) ) )
    def get_result ( self ) :
        num_nodes = int ( sys.stdin.readline ( ) )
        nodes = [ string.__new__ ( string ) for _ in range ( num_nodes ) ]
        for i in range ( num_nodes ) :
            num_children = int ( sys.stdin.readline ( ) )
            for j in range ( num_children ) :
                child = int ( sys.stdin.readline ( ) )
                nodes [ child - 1 ].childNodes.append ( nodes [ i ] )
        for node in nodes :
            if len ( node.childNodes ) > 1 and node.has_diamond :
                return 'Yes'
        return 'No'
    class Q1 ( object ) :
        def __init__ ( self ) :
            self.childNodes = list ( )
        def has_diamond :
            self.found_sentinel = [ ]
            fast_lookup = set ( [ self , '' ] )
            while len ( found_sentinel ) > 0 :
                node = found_sentinel.pop ( )
                for child in node.childNodes :
                    if child in fast_lookup :
                        return True
                    found_sentinel.append ( child )
                    fast_lookup.add ( child )
            return False
    Q1.get_result ( )
