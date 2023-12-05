def center_length ( s ) :
    import string
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = s
            self.center = ''
            self.length = 2
            left , right = N // 2 - 2 , N // 2 + 1
            while left >= 0 and s [ left ] == center and s [ right ] == center :
                left -= 1
                right += 1
                length += 2
            return length
        def __call__ ( self ) :
            with open ( self.s ) as sc :
                S = sc.read ( )
    def main ( ) :
        return Main ( )
    N = len ( s )
    if N % 2 == 0 :
        if s [ N // 2 ] != s [ N // 2 - 1 ] :
            return 0
        center = s [ N // 2 ]
        length = 2
        left , right = N // 2 - 2 , N // 2 + 1
        while left >= 0 and s [ left ] == center and s [ right ] == center :
            left -= 1
            right += 1
            length += 2
        return length
    else :
        center = s [ N // 2 ]
        left , right = N // 2 - 1 , N // 2 + 1
        length = 1
        while left >= 0 and s [ left ] == center and s [ right ] == center :
            left -= 1
            right += 1
            length += 2
        return length
