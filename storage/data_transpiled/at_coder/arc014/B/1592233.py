def main ( ) :
    import sys
    from os import path
    from os import getcwd
    from os.path import join
    from os.path import expanduser
    from os.path import join
    from os.path import join
    from os.path import dirname , join
    from os.path import join
    N = len ( sys.argv )
    used = set ( )
    last = ''
    lostindex = - 1
    flag = False
    for i , w in enumerate ( sys.argv [ 1 : ] ) :
        if i != 0 :
            if w [ 0 ] != last [ - 1 ] and not flag :
                lostindex = i
                flag = True
        if i % 2 == 0 :
            if w in used and not flag :
                lostindex = i
                flag = True
            used.add ( w )
        if i % 2 != 0 :
            if w in used and not flag :
                lostindex = i
                flag = True
            used.add ( w )
        last = w
    if lostindex == - 1 :
        print ( 'DRAW' )
        return
    if lostindex % 2 == 0 :
        print ( 'LOSE' )
        return
    elif lostindex % 2 == 1 :
        print ( 'WIN' )
        return
