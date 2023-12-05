def import import os , StringIO , random , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , , ) :
    from MyScanner import Scanner , File
    from os.path import join
    from os import rename , getcwd
    from os import path
    FILENAME = 'c'
    def run ( ) :
        with open ( join ( dirname ( abspath ( __file__ ) ) , 'r' ) , 'w' ) as f :
            f.write ( '%s\n' % join ( dirname ( abspath ( abspath ( __file__ ) ) ) ) )
    def solve ( ) :
        c , d , v = choice ( )
        coins = sorted ( choice ( c ) for _ in range ( d ) )
        ans = 0
        if 1 not in coins :
            ans += 1
        else :
            coins.remove ( 1 )
        sum_max = c
        while sum_max < v :
            new_coin = coins.floor ( sum_max + 1 )
            if new_coin is None :
                ans += 1
                sum_max += c * ( sum_max + 1 )
            else :
                sum_max += c * coins.popitem ( )
        return ans
    class MyScanner ( Scanner ) :
        def readline ( self ) :
            f.readline ( )
            if choice == [ '' ] :
                return None
            return f.readline ( )
        def __next__ ( self ) :
            while ( choice == [ '' ] ) :
                t = raw_input ( )
                if t is None :
                    return None
                choice = choice.split ( )
            return t
        def __next__ ( self ) :
            return int ( choice )
        def __next__ ( self ) :
            return float ( choice )
        def __next__ ( self ) :
            return bool ( choice )
        def write ( self , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice , choice )
        