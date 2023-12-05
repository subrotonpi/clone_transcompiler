def _import ( ) :
    import os
    import os
    import sys
    import os
    import time
    import subprocess
    import subprocess
    import time
    import os
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    import subprocess
    class A :
        def __init__ ( self , s , m , id ) :
            self.s = s
            self.m = m
            self.id = id
        def is_vowel ( ch ) :
            return ch in [ 'o' , 'a' , 'e' , 'u' , 'i' ]
        def run ( self ) :
            a = s
            n = len ( a )
            consecutive_cons_next = [ 0 ]
            for i in range ( n - 1 , - 1 , - 1 ) :
                if is_vowel ( a [ i ] ) :
                    consecutive_cons_next.append ( 0 )
                else :
                    consecutive_cons_next [ i ] = consecutive_cons_next [ i + 1 ] + 1
            next_pos_of_at_least_m_conseq_consecutive = [ - 1 ]
            for i in range ( n - 1 , - 1 , - 1 ) :
                if consecutive_cons_next [ i ] >= m :
                    next_pos_of_at_least_m_conseq_consecutive.append ( i )
                else :
                    next_pos_of_at_least_m_conseq_consecutive.append ( next_pos_of_at_least_m_conseq_consecutive [ i + 1 ] )
            ans = 0
            for i in range ( n ) :
                if next_pos_of_at_least_m_conseq_consecutive [ i ] != - 1 :
                    ans += n - next_pos_of_at_least_m_conseq_consecutive [ i ] - m + 1
            result = "%d" % ans
            answers [ id ] = result
            self.ready.append ( result )
            sys.stderr.write ( "%d ready %s\n" % ( id , result ) )
    return A
