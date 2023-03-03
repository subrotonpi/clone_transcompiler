def _import ( ) :
    from sys import stdin
    import random
    class Main ( object ) :
        MOD = 1000000007
        @ staticmethod
        def read ( ) :
            scanner = BetterScanner ( sys.stdin )
            n = scanner.randint ( 0 , 1 )
            aa = [ ]
            for i in range ( n ) :
                aa.append ( ( scanner.randint ( 0 , 1 ) , i ) )
            aa.sort ( lambda a1 , a2 : a1.fst - a2.fst )
            res = 0
            for i in range ( n ) :
                if abs ( aa [ i ].snd - i ) % 2 != 0 :
                    res += 1
            print ( res / 2 )
    else :
        raise StopIteration
    def read ( ) :
        return random.randint ( 0 , 1 )
    def next_long_array ( n ) :
        array = [ ]
        for i in range ( n ) :
            array.append ( ( chr ( i ) , i ) )
        return array
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return random.randint ( 0 , 1 )
    def next_int ( n ) :
        return next_int ( n )
    return next_@@