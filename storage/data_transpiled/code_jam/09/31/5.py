def r1c ( f ) :
    import os
    from glob import glob
    from os.path import join
    from os import sep
    from os.path import join
    from os.path import join
    from os.path import join
    from os import sep
    from os.path import join
    from os import sep
    from os import chdir
    h = { }
    zero_used = False
    big = 1
    for c in f :
        if h.get ( c ) is None :
            if big > 1 and zero_used is False :
                zero_used = True
                h [ c ] = 0
            else :
                h [ c ] = big
                big += 1
    out = 0
    for c in f :
        out = out * big + h [ c ]
    return out
