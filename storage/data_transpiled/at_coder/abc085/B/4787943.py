def main ( arg = None ) :
    import sys
    from itertools import chain
    from itertools import repeat
    from itertools import chain
    from itertools import chain
    N = len ( chain ( * repeat ( arg ) ) )
    hs = chain ( chain ( * repeat ( arg ) ) )
    print ( len ( hs ) )
