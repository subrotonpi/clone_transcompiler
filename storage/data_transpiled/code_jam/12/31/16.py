def _import ( ) :
    import os
    import sys
    class IO :
        def __init__ ( self ) :
            self.test_num = 0
            self.test_counter = 0
        def __init__ ( self , f ) :
            self.io = f
            self.io = io
            self.io.write = f
    class SolutionA ( IO ) :
        def __init__ ( self ) :
            self.n = 0
            self.r = [ ]
            self.mark = [ ]
            def dfs ( v , q ) :
                if self.mark [ v ] == q : return True
                self.mark [ v ] = q
                for u in self.r [ v ] :
                    if self.dfs ( u , q ) : return True
                return False
            def run ( self ) :
                nonlocal self.test_num
                self.test_counter += 1
                self.n = self.n
                self.r = [ ]
                for i in range ( self.n ) :
                    t = [ ]
                    m = self.n
                    for j in range ( m ) :
                        t.append ( self.n - 1 )
                    self.r.append ( t )
            self.mark = [ ]
            ans = False
            for i in range ( self.n ) :
                if self.mark [ i ] == 0 and self.dfs ( i , i + 1 ) :
                    ans = True
                    break
            nonlocal self.test_counter
            self.test_counter += 1
    class Solution ( IO ) :
        def __init__ ( self ) :
            self.thread_count = 4
            def solve_parallel ( self , test_count ) :
                thread = [ ]
                for i in range ( self.thread_count ) :
                    thread_num = i % self.thread_count
                    if thread [ thread_num ] : thread [ thread_num ].join ( )
                    thread [ thread_num ] = threading.Thread ( target = None , args = ( self.solution , str ( i ) , 1000000 ) )
                    thread [ thread_num ].start ( )
                for th in thread :
                    if th : th.join ( )
    Solution.__init__ ( )
