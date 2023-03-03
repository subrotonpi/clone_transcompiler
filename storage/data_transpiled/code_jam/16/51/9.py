def _import ( ) :
    import sys
    import os
    import threading
    import sys
    class A :
        def solve ( self ) :
            n = len ( self.s )
            a = [ ]
            stack = [ ]
            size = 0
            ans = 0
            for i in range ( n ) :
                if size > 0 and stack [ size - 1 ] == self.s [ i ] :
                    ans += 2
                    size -= 1
                    continue
                stack.append ( self.s [ i ] )
                size += 1
            ans += size / 2
            return "%d" % 5 * ans
        def solve ( self ) :
            s = self.s.split ( "\n" )
    def main ( ) :
        n_threads = 1
        filename_suffix = ""
        format_out = "Case #%2$d: %1$s"
        format_system_out = format_out
        fname = re.sub ( "_.*" , "" , fname ).lower ( ) + filename_suffix
        input_fname = fname + ".in"
        output_fname = fname + ".out"
        locale.setlocale ( locale.LC_ALL , '' )
        with open ( input_fname , 'r' ) as infile , open ( output_fname , 'w' ) as outfile :
            tests = len ( infile.readlines ( ) )
            outfile.readline ( )
            n_threads = min ( n_threads , tests )
            @ gen.coroutine
            def callables ( self ) :
                for t , _ in enumerate ( self.outputs ) :
                    self.outputs [ t ] = self.executor.submit ( callables )
            for t , _ in enumerate ( self.outputs ) :
                self.outputs [ t ].wait ( )
    try :
        if n_threads > 1 :
            executor = futures.ThreadPoolExecutor ( max_workers = 4 )
            @ gen.coroutine
            def callables ( self ) :
                for t , _ in enumerate ( self.outputs ) :
                    self.outputs [ t ] = self.executor.submit ( callables )
        else :
            for t , _ in enumerate ( self.outputs ) :
                self.outputs [ t ].wait ( )
    except :
        sys.stdout.flush ( )
        sys.stderr.