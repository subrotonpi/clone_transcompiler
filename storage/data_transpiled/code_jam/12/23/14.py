def _import ( ) :
    import sys
    import os
    class Equal ( object ) :
        def __init__ ( self , out ) :
            self.out = out
        def __init__ ( self , out ) :
            self.out = out
        def __init__ ( self , * args , ** kwargs ) :
            self.out = out
        def get_nexts ( self ) :
            return [ ]
        def next ( self ) :
            return self.lastIndex + 1
        def _sum ( self ) :
            return self._sum
        def _working ( self , * args , ** kwargs ) :
            return [ ]
        def do_case ( self , case_number ) :
            line = self.line
            with open ( line , 'r' ) as scan :
                n = scan.__next__ ( )
                nums = [ ]
                sum = 0
                for i in range ( n ) :
                    nums.append ( scan.__next__ ( ) )
                    sum += nums [ i ]
            self.max = sum // 2
            nums.sort ( )
            all = { }
            working = [ ]
            for i in range ( n ) :
                singleton = Subset ( i )
                all [ singleton.sum ] = singleton
                working.append ( singleton )
            while not working :
                last_working = copy.copy ( working )
                working = [ ]
                for subset in last_working :
                    for new_subset in subset.nexts :
                        already_found = all.get ( new_subset.sum )
                        if already_found is None :
                            all [ new_subset.sum ] = new_subset
                            working.append ( new_subset )
                        else :
                            already_found._print ( )
                            self.new_subset._print ( )
                            self.out._print ( )
                            return
            out._print ( 'Impossible' )
        def run ( self ) :
            num_cases = int ( self.line.strip ( ) )
            for i in range ( 1 , num_cases + 1 ) :
                out._print ( 'Case #%d:' % i )
                do_case ( self , i )
    return Equal
