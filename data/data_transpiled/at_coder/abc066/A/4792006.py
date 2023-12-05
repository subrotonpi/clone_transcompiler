def main ( ) :
    import sys
    from itertools import repeat
    for a , b , c in repeat ( sys.stdin , 1 ) :
        if a + b <= b + c :
            if a + b <= c + a :
                yield a + b
            else :
                yield c + a
        elif b + c <= c + a :
            yield b + c
        else :
            yield c + a
