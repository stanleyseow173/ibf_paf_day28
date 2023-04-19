use bggdb;

db.game.aggregate([
    {
        $match: {gid:3}
    },
    {
        $lookup:
        {
            from: "reviews",
            localField: "gid",
            foreignField: "gid",
            as: "reviewDocs"
        }
    },
    {
        $project: {_id:-1, gid:1, name:1, year:1, ranking: 1, 
        users_rated:1, url:1, image:1, reviews: "$reviewDocs._id",
        timestamp:"$$NOW"}
    }
]);