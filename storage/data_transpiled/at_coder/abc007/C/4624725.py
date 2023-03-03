def _import ( ) :
    from collections import Queue
    from os import urandom
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = urandom ( )
            self.R = int ( self.R )
            self.C = int ( self.C )
            self.cnt = self.cnt
        def __init__ ( self ) :
            self.r = r
            self.c = c
            self.cnt = self.cnt
    print ( answer )
    sc.close ( )
    class Point ( object ) :
        def __init__ ( self ) :
            self.sc = urandom ( )
    RC = sc.readline ( ).split ( )
    R = int ( RC [ 0 ] )
    C = int ( RC [ 1 ] )
    maze = [ [ ] ]
    reached = [ [ False ] ]
    start_rc = sc.readline ( ).split ( )
    start_r = int ( start_rc [ 0 ] ) - 1
    start_c = int ( start_rc [ 1 ] ) - 1
    goal_rc = sc.readline ( ).split ( )
    goal_r = int ( goal_rc [ 0 ] ) - 1
    goal_c = int ( goal_rc [ 1 ] ) - 1
    for i in range ( R ) :
        maze [ i ] = sc.readline ( ).split ( )
    q = Queue ( )
    q.put ( ( start_r , start_c , 0 ) )
    reached [ start_r ] [ start_c ] = True
    dr = [ 1 , - 1 , 0 , 0 ]
    dc = [ 0 , 0 , 1 , - 1 ]
    answer = 0
    tmp_r = 0
    tmp_c = 0
    tmp_cnt = 0
    while not q.empty ( ) :
        now = q.get ( )
        if now.r == goal_r and now.c == goal_c :
            answer = now.cnt
            break
        tmp_cnt = now.cnt + 1
        for i in range ( len ( dc ) ) :
            tmp_r = now.r + dr [ i ]
            tmp_c = now.c + dc [ i ]
        if not ( tmp_r < 0 ) :
            tmp_r = tmp_r
    return answer
