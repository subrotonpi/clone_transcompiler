def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = int ( sys.argv [ 1 ] )
    def main ( ) :
        sc = open ( "/proc/" , "r" )
        N = sc.read ( )
        prime_count = { 1 : 1 }
        for i in range ( 2 , N + 1 ) :
            value = i
            for j in range ( 2 , i + 1 ) :
                while value % j == 0 :
                    prime_count [ j ] = prime_count [ j ] + 1 if j in prime_count else 1
                    value = value // j
    ans = 0
    for entry0 , entry1 in prime_count.items ( ) :
        for entry2 , entry2 in prime_count.items ( ) :
            if entry0 == entry1 : continue
            if entry0 == entry2 : continue
            if entry1 == entry2 : continue
            if entry1 > entry2 : continue
            if entry0 >= 2 and entry1 >= 4 and entry2 >= 4 : ans += 1
    for entry0 , entry1 in prime_count.items ( ) :
        for entry0 , entry2 in prime_count.items ( ) :
            if entry0 == entry1 : continue
            if entry0 >= 4 and entry1 >= 14 : ans += 1
            if entry0 >= 2 and entry1 >= 24 : ans += 1
    for count in prime_count.values ( ) :
        if count >= 74 : ans += 1
    print ( ans )
