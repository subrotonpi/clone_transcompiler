def main ( ) :
    import sys
    from pytree import Tree
    from pytree import Tree
    with open ( "/proc/test/input" , "r" ) as sc :
        cases = sc.read ( )
        sc.readline ( )
        for c in range ( 1 , cases + 1 ) :
            num_base = sc.read ( )
            num_new = sc.read ( )
            root = Tree ( )
            for s in sc.read ( ).split ( "/" ) :
                parts = s.split ( "/" )
                cd = root
                for p in parts [ 1 : ] :
                    if p in cd.children :
                        cd = cd.children [ p ]
                    else :
                        nw = Tree ( )
                        cd.children [ p ] = nw
                        cd = nw
            count = 0
            for s in sc.read ( ).split ( "/" ) :
                parts = s.split ( "/" )
                cd = root
                for p in parts [ 1 : ] :
                    if p in cd.children :
                        cd = cd.children [ p ]
                    else :
                        nw = Tree ( )
                        cd.children [ p ] = nw
                        cd = nw
                        count += 1
            print ( "Case #{}: {}".format ( c , count ) )
    class TreeNode ( Tree ) :
        children = { }
    return TreeNode ( )
