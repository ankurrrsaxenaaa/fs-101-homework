# **Day 01 Questions**

Read all the resources mentioned in Lecture 1

Find the technical stack of one website that you use

Write 3 new features introduced in HTTP/2

Find out all the places where DNS cache is maintained?

If IPv4 can only have 4 billion unique IP address how come more than [7 billion](https://techjury.net/blog/how-many-iot-devices-are-there/) devices are able to access internet?

**Reference slide:** [Link](http://bit.ly/fs101-day01)

# **Technical stack of Github:**

- **Data Storage:** PostgreSQL
- **Operating System:** Linux
- **Continuous Integration:** Travis-CI
- **Deployment:** AWS, Microsoft Azure Cloud
- **Application Server:** HTTPS and WebSocket: Phoenix, elixir, tachyons, elm **|** Node.js, hapi, RIOT, socket.io
- **Database Cluster:** Highly-Available PostgreSQL Cluster on Azure
- **Session Store Cache:**  redis
- **Full Text Search:** ElasticSearch
- **Dependencies:** Node.js, Hapi.js, Socket.io, Riot.js, Redis, ElasticSearch
- **Testing:** Tape
- **Code Coverage:** Istanbul
- **Commits:** Pre-commit
- **Code Styling:** Good Parts
- **Code Quality Assurance:** Code Climate
- **Test/code coverage stats:** CodeConv
- **Encryption:** SSL/TLS Encryption

# **New Features introduced in HTTP/2**

- **Header Compression:** HTTP/2 compress a large number of redundant header frames. It uses the HPACK specification as a simple and secure approach to header compression. Both client and server maintain a list of headers used in previous client-server requests.

  HPACK compresses the individual value of each header before it is transferred to the server, which then looks up the encoded information in a list of previously transferred header values to reconstruct the full header information.

- **HTTP/2 Server Push:** This capability allows the server to send additional cacheable information to the client that isn’t requested but is anticipated in future requests. For example, if the client requests for the resource X and it is understood that the resource Y is referenced with the requested file, the server can choose to push Y along with X instead of waiting for an appropriate client request.

- **Binary Protocol:** The latest HTTP version has evolved significantly in terms of capabilities and attributes such as transforming from a text protocol to a binary protocol. HTTP1.x used to process text commands to complete request-response cycles. HTTP/2 will use binary commands (in 1s and 0s) to execute the same tasks. This attribute eases complications with framing and simplifies implementation of commands that were confusingly intermixed due to commands containing text and optional spaces.

  Browsers using HTTP/2 implementation will convert the same text commands into binary before transmitting it over the network.

# **Places where DNS cache is maintained**

- Browser Level 
- Operating System Level
- DNS Resolver
- TLD Server
- Root Server

# **How 7 billion devices are able to access the Internet?**

This is done via Network Address Translation (NAT). An enormous number of devices are actually on private networks (192.168.x.x, 172.16.x.x, or 10.x.x.x for example). But these private networks often sit behind a single public IP address. This is usually accomplished with router hardware, often combined with firewall functionality. For example, most home environments nowadays have wireless router/firewall appliances connected to a single Internet Service Provider (ISP) connection, with a single public IP address.
