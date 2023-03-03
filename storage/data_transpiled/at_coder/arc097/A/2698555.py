def import _PriorityQueue , Scanner ) :
    from collections import deque
    from collections import deque
    Scanner ( "" ).read ( )
    s = Scanner ( ).read ( )
    K = Scanner ( ).read ( )
    queue = deque ( )
    for l in range ( 1 , len ( s ) + 1 ) :
        for i in range ( 0 , len ( s ) - l ) :
            sb = s [ i : i + l ]
            if sb not in queue :
                queue.append ( sb )
    val = ""
    for i in range ( K ) :
        val = queue.pop ( )
    print ( val )
