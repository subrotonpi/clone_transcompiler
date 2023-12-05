def _main ( ) :
    import sys
    import os
    import sys
    from os.path import join
    from os import urandom
    import random
    from os.path import join
    from os.path import join
    from os.path import join
    from os.path import join
    from os import getcwd
    from os.path import join
    from os.path import join
    from os import sep , join
    from os.path import join
    from os import chdir
    ntests = randint ( 1 , 5 )
    for test in range ( 1 , ntests + 1 ) :
        s = next ( iter ( sys.stdin ) )
        k = randint ( 1 , 5 )
        out.write ( 'Case #%d: %s\n' % ( test , solve ( s , k ) ) )
    vowels = 'aeiou'
    def is_consonant ( c ) :
        return vowels.find ( c ) < 0
    def solve ( s , k ) :
        l = r = 0
        res = 0
        for i in range ( len ( s ) ) :
            advance ( s , k , i )
            res += len ( s ) - r
        return res
    l , r = 0 , 0
    def advance ( s , k , pos ) :
        while l < pos :
            l += 1
        while l < len ( s ) :
            while l < len ( s ) and not is_consonant ( s [ l ] ) :
                l += 1
            if r < l :
                r = l
            while r < len ( s ) and r - l + 1 < k :
                if r + 1 < len ( s ) and is_consonant ( s [ r + 1 ] ) :
                    r += 1
                else :
                    l = r + 1
                    r = l
                    break
            if r - l + 1 >= k :
                break
    if not sys.stdin.isatty ( ) or not sys.stdout.isatty ( ) :
        rl = raw_input ( )
        if not rl :
            return
        rl = re.split ( r'\s+' , rl )
        return next ( rl )
    else :
        return solve ( r )
