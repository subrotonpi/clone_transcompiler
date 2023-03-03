def import _dfs_list
import os
import sys
import os
import sys
import string
import string
import string
import string
import sys
import os
import sys
import string
import string
import string
import string
import set
class Main ( object ) :
    def __init__ ( self ) :
        self.K = 0
        self.N = 0
        self.v = [ ]
        self.w = [ ]
        for i in range ( self.N ) :
            self.v.append ( string.strip ( ' ' ) )
            self.w.append ( string.strip ( ' ' ) )
    def __init__ ( self ) :
        self.v.append ( string.strip ( ' ' ) )
        self.w.append ( string.strip ( ' ' ) )
    def dfs ( lst ) :
        if len ( lst ) == K :
            ans = [ ]
            for i in range ( self.N + 1 ) :
                current = 0
                for d in range ( len ( self.v [ i ] ) ) :
                    n = self.v [ i ] - '0'
                    size = lst [ n - 1 ]
                    if len ( self.w [ i ] ) < current + size :
                        return None
                    s = self.w [ i ] [ current : current + size ]
                    if not ans [ n ] :
                        ans.append ( s )
                    elif not ans [ n ] in [ s ] :
                        return None
                    current += size
                if len ( self.w [ i ] ) != current :
                    return None
            return ans
        for i in range ( 1 , 3 ) :
            new_lst = [ ]
            for l in lst :
                new_lst.append ( l )
            new_lst.append ( i )
        result = dfs ( new_lst )
        if result :
            return result
